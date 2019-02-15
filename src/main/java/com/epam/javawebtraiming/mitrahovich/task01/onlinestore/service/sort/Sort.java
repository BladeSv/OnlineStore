package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.service.sort;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.abstractentity.Device;

public class Sort{

	public static void sortByPrice(Device[] deviceBase) {
		 int j;
		 Device temp;
		    for(int i = 0; i < deviceBase.length - 1; i++){
		        if (deviceBase[i].getPrice() > deviceBase[i + 1].getPrice()) {
		           temp = deviceBase[i + 1];
		           deviceBase[i + 1] = deviceBase[i];      
		           j = i;
		           while (j > 0 && temp.getPrice() < deviceBase[j - 1].getPrice()) {
		        	   deviceBase[j] = deviceBase[j - 1];               
		               j--;
		           }
		           deviceBase[j] = temp;             
		        }        
		    }
		
	}

	public static void sortByManufacturerName(Device[] deviceBase) {
		Device temp;
		for(int i=0;i<deviceBase.length;i++) {
			for(int j=0;j<deviceBase.length;j++) {	
			if(deviceBase[i].getManufacturer().compareToIgnoreCase(deviceBase[j].getManufacturer())>0) {
				temp=deviceBase[i];
				deviceBase[i]=deviceBase[j];
				deviceBase[j]=temp;
				
			}
			
		}
		}
		
	}

}
