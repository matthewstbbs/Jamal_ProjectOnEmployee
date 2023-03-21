package com.cydeo.pages;

public class LocatorFinding {

    //Employees tab-->  //a[@title='Employees']/span

// ustteki Company Structure -->  (//span[.='Company Structure'])[1]
// veya *  //a[@class='main-buttons-item-link']/span/span/following-sibling::span

//  alttaki Company Structure  --> //span[@id='pagetitle']     veya *  //div[@class='pagetitle']/span

// ustteki Telephone Directory -->  (//span[.='Telephone Directory'])
//   veya *  (//a[@class='main-buttons-item-link']/span/span/following-sibling::span)[7]

// alttaki Telephone Directory  -->  //span[@id='pagetitle'] veya  *  (//div[@class='pagetitle']/span)[1]
}
