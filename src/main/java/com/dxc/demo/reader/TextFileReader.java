package com.dxc.demo.reader;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TextFileReader {

	private Logger LOG = LoggerFactory.getLogger(this.getClass());

	private static String INPUT_FILE = "/inputData/CALPER.txt";

	public String getFileName() {
		
		LOG.info("====== start ==========");

		ClassLoader classLoader = getClass().getClassLoader();

		File file = new File(classLoader.getResource(".").getFile());

		String filePathStr = file.getParentFile().getParentFile().getAbsolutePath() + INPUT_FILE;

		LOG.info("File Path : " + filePathStr);

		return filePathStr;
	}

}
