package arraysProgs;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Hiretual {

	public static void main(String[] args) throws Exception {
		
		List<File> outputFiles = new ArrayList();
		getFileNames("/home/neil/Desktop/hiretual",outputFiles);
		System.out.println(outputFiles);
	}
	
	static void getFileNames(String dirPath, List<File> outputFiles)
	{
		File file = new File(dirPath);
		if(file.isFile())
		{
			outputFiles.add(file);
		}
		else
		{
			File[] files = file.listFiles();
			for(File f : files)
			{
				if(f.isFile())
				{
					outputFiles.add(f);
				}
				else if(f.isDirectory())
				{
					getFileNames(f.getAbsolutePath(), outputFiles);
				}
			}
		}
	}

}
