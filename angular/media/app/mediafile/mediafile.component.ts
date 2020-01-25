import { Component, OnInit } from '@angular/core';
import { Media } from "../models/mediacontent";
@Component({
  selector: 'mediafile',
  templateUrl: './mediafile.component.html',
  styleUrls: ['./mediafile.component.css']
})
export class MediafileComponent  {
  title:string;
  description:string;
  tags:string;
  filename:string;
  medias: Array<Media>;
  constructor() 
  {
    
    this.medias = [
      new Media("comedy","comedy content","comedy","firstfile"),
      new Media("action","action content","action","secondfile"),
    ];

  }

  savemedia(txttitle:HTMLInputElement, txtdescription:HTMLInputElement, txttags:HTMLInputElement,txtfilename:HTMLInputElement):void{
 
      let media = new Media(txttitle.value, txtdescription.value,txttags.value,txtfilename.value);
      this.medias.push(media);
      txttitle.value = " ";
      txtdescription.value = " ";
      txttags.value ="";
      txtfilename.value="";
  }
}    
