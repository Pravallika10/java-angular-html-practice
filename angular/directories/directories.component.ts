import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'directories',
  templateUrl: './directories.component.html',
  styleUrls: ['./directories.component.css']
})
export class DirectoriesComponent  {

    name:String;
    age:number;
    email:String;

  constructor() {
    this.name="first";
    this.age=14;
    this.email="first@mail.com";
  }
    changeIn():void{
    this.name="second";
    this.age=25;
    this.email="second@mail.com";
   }

}
