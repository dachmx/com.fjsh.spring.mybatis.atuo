package com.fjsh.spring.mybasti.auto.classcreator;

import java.io.File;

import com.fjsh.spring.mybasti.auto.utils.GlobalsParam;
import com.fjsh.spring.mybasti.auto.utils.IConstants;

public class SpringMVCCreateFolder {

	public static void createrFolder() throws Exception {
		//生成target目录
		String folder = GlobalsParam.getPreference("outputfolder")
		+ "/target";
		File f = new File(folder);
		if (!f.exists())
			f.mkdirs();
		
		//生成开发配置目录
		folder = GlobalsParam.getPreference("outputfolder")
		+ "/src/main/resources.dev";
		 f = new File(folder);
		if (!f.exists())
			f.mkdirs();
		//生成wbapp配置目录
				folder = GlobalsParam.getPreference("outputfolder")
				+ "/src/main/webapp";
				 f = new File(folder);
				if (!f.exists())
					f.mkdirs();
		
		 folder = GlobalsParam.getPreference("outputfolder")
			+ "/config";
			f = new File(folder);
			if (!f.exists())
				f.mkdirs();
		
		//FileUtils.copyFile(new File(GlobalsParam.getPreference("localproject")+"config/project/mysql.properties"), new File(folder+"/mysql.properties"));	
		//FileUtils.copyFile(new File(GlobalsParam.getPreference("localproject")+"config/project/swap.config"), new File(folder+"/swap.config"));	

		folder = GlobalsParam.getPreference("outputfolder")
				+ "/"
				+ GlobalsParam.getPreference("basejavafolder").replaceAll(
						"\\.", "/")
				+ "/"
				+ GlobalsParam.getPreference("basepackage").replaceAll("\\.",
						"/") + "/" + "config";
		f = new File(folder);
		if (!f.exists())
			f.mkdirs();
		//controller
		folder = GlobalsParam.getPreference("outputfolder")
				+ "/"
				+ GlobalsParam.getPreference("basejavafolder").replaceAll(
						"\\.", "/")
				+ "/"
				+ GlobalsParam.getPreference("basepackage").replaceAll("\\.",
						"/") + "/" + "controller";
		f = new File(folder);
		if (!f.exists())
			f.mkdirs();
		folder = GlobalsParam.getPreference("outputfolder")
				+ "/"
				+ GlobalsParam.getPreference("basejavafolder").replaceAll(
						"\\.", "/")
				+ "/"
				+ GlobalsParam.getPreference("basepackage").replaceAll("\\.",
						"/") + "/" + "dao";
		f = new File(folder);
		if (!f.exists())
			f.mkdirs();
		//create service folder
		folder = GlobalsParam.getPreference("outputfolder")
				+ "/"
				+ GlobalsParam.getPreference("basejavafolder").replaceAll(
						"\\.", "/")
				+ "/"
				+ GlobalsParam.getPreference("basepackage").replaceAll("\\.",
						"/") + "/" + "service";
		f = new File(folder);
		if (!f.exists())
			f.mkdirs();
		//create serviceimpl folder
		folder = GlobalsParam.getPreference("outputfolder")
				+ "/"
				+ GlobalsParam.getPreference("basejavafolder").replaceAll(
						"\\.", "/")
				+ "/"
				+ GlobalsParam.getPreference("basepackage").replaceAll("\\.",
						"/") + "/" + "service/impl";
		f = new File(folder);
		if (!f.exists())
			f.mkdirs();

		folder = GlobalsParam.getPreference("outputfolder")
				+ "/"
				+ GlobalsParam.getPreference("basejavafolder").replaceAll(
						"\\.", "/")
				+ "/"
				+ GlobalsParam.getPreference("basepackage").replaceAll("\\.",
						"/") + "/" + "utils";
		f = new File(folder);
		if (!f.exists())
			f.mkdirs();

		// 生成resources目录
		folder = GlobalsParam.getPreference("outputfolder")
				+ "/"
				+ GlobalsParam.getPreference("baseresourcesfolder").replaceAll(
						"\\.", "/") + "/";
		f = new File(folder);
		if (!f.exists())
			f.mkdirs();
		
//		// 生成spring配置文件夹
//		folder = GlobalsParam.getPreference("outputfolder")
//				+ "/"
//				+ GlobalsParam.getPreference("baseresourcesfolder").replaceAll(
//						"\\.", "/") + "/spring";
//		f = new File(folder);
//		if (!f.exists())
//			f.mkdirs();
		
	
		folder = GlobalsParam.getPreference("outputfolder")
				+ "/"
				+ GlobalsParam.getPreference("baseresourcesfolder").replaceAll(
						"\\.", "/") + "/META-INF";
		f = new File(folder);
		if (!f.exists())
			f.mkdirs();
		
		folder = GlobalsParam.getPreference("outputfolder")
				+ "/"
				+ GlobalsParam.getPreference("baseresourcesfolder").replaceAll(
						"\\.", "/") + "/"+ GlobalsParam.getPreference("Mappersfolder");	
		f = new File(folder);
		if (!f.exists())
			f.mkdirs();
		
		// 生成实体目录		
		 f = new File(GlobalsParam.ENTITY_FILEPATH);
		if (!f.exists())
			f.mkdirs();

		// -------------------生成test

		folder = GlobalsParam.getPreference("outputfolder")
				+ "/"
				+ GlobalsParam.getPreference("basetestjavafolder").replaceAll(
						"\\.", "/") + "/";
		f = new File(folder);
		if (!f.exists())
			f.mkdirs();
		//create test service folder
				folder = GlobalsParam.getPreference("outputfolder")
						+ "/"
						+ GlobalsParam.getPreference("basetestjavafolder").replaceAll(
								"\\.", "/")
						+ "/"
						+ GlobalsParam.getPreference("basepackage").replaceAll("\\.",
								"/") + "/" + "service";
				f = new File(folder);
				if (!f.exists())
					f.mkdirs();
				

		folder = GlobalsParam.getPreference("outputfolder")
				+ "/"
				+ GlobalsParam.getPreference("basetestresourcesfolder")
						.replaceAll("\\.", "/") + "/";
		f = new File(folder);
		if (!f.exists())
			f.mkdirs();
		folder = GlobalsParam.getPreference("outputfolder")
				+ "/"
				+ GlobalsParam.getPreference("basetestresourcesfolder")
						.replaceAll("\\.", "/") + "/META-INF";
		f = new File(folder);
		if (!f.exists())
			f.mkdirs();
	}
	
	
}
