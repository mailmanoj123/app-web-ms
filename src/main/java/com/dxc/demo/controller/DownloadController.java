package com.dxc.demo.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dxc.demo.reader.TextFileReader;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class DownloadController {
	
	TextFileReader textFileReader;
	
	@RequestMapping("/download")
	public ResponseEntity<ByteArrayResource> downloadTextFileExample2() throws IOException {
		
		String fileNameStr = textFileReader.getFileName();
		
		Path fileName = Path.of(fileNameStr);
		
		// Download file with ByteArrayResource
		byte[] exportedFileData = Files.readAllBytes(fileName);
		ByteArrayResource byteArrayResource = new ByteArrayResource(exportedFileData);
		
		return ResponseEntity.ok()
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + "download.txt")
				.contentType(MediaType.TEXT_PLAIN)
				.contentLength(exportedFileData.length)
				.body(byteArrayResource);
	}

}
