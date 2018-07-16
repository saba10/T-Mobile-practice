package com.example.demo.Service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.config.RabbitConfiguration;
import com.example.demo.model.RabbitModel;

@Service
public class RabbitMQService {
	
	@Autowired 
	private RabbitTemplate rabbitTemplate;

	public ArrayList<RabbitModel> read() throws Exception {
		// TODO Auto-generated method stub
		XSSFWorkbook xSSFWorkbook=new XSSFWorkbook(new FileInputStream("File.xlsx"));
		XSSFSheet sheet=xSSFWorkbook.getSheetAt(0);
		System.out.println(sheet.getLastRowNum());
		XSSFRow[] row=new XSSFRow[(sheet.getLastRowNum()+1)];
		
		ArrayList<RabbitModel> arrayList=new ArrayList<RabbitModel>();
		
		for(int i=0;i<=sheet.getLastRowNum();i++)
		{
			RabbitModel rm=new RabbitModel();
			row[i]=sheet.getRow(i);
			
			rm.setAge((int)row[i].getCell(2).getNumericCellValue());
			rm.setSex(row[i].getCell(1).getStringCellValue());
			rm.setName(row[i].getCell(0).getStringCellValue());
			
			arrayList.add(rm);	
		}
		
		for (RabbitModel rabbitModel2 : arrayList) {
			System.out.println(rabbitModel2.getName());
			System.out.println(rabbitModel2.getSex());
			System.out.println(rabbitModel2.getAge());	
		}
		
		return arrayList;	
	
	}

	/*public void testSend(String message) {
		// TODO Auto-generated method stub
		rabbitTemplate.convertAndSend(RabbitConfiguration.ROUTING_KEY, message);
		
	}*/
	public void testSend2(RabbitModel rabbitModel) {
		// TODO Auto-generated method stub
		rabbitTemplate.convertAndSend(RabbitConfiguration.ROUTING_KEY, rabbitModel);
		
	}

}
