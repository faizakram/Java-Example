package com.osm.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Zip_dir_all {
	public static void main(String[] args) throws IOException {
		String dirpath = "E:\\opt";
		String ZipName = "E:\\opt.zip";
		ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(ZipName));
		zipdirectory(dirpath, zos);
		zos.close();
	}

	public static void zipdirectory(String dirpath, ZipOutputStream zos) throws IOException {
		File f = new File(dirpath);
		
		String[] flist = f.list();
		for (int i = 0; i < flist.length; i++) {
			File ff = new File(f, flist[i]);
			if (ff.isDirectory()) {
				zipdirectory(ff.getPath(), zos);
				continue;
			}
			String filepath = ff.getPath();
			ZipEntry entries = new ZipEntry(filepath);
			zos.putNextEntry(entries);
			FileInputStream fis = new FileInputStream(ff);
			int buffersize = 1024;
			byte[] buffer = new byte[buffersize];
			int count;
			while ((count = fis.read(buffer)) != -1) {
				zos.write(buffer, 0, count);
			}
			fis.close();
		}
	}
}
