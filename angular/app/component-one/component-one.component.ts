import { Component, OnInit } from '@angular/core';
import { ConversionService } from '../services/conversion.service';

@Component({
  selector: 'component-one',
  templateUrl: './component-one.component.html',
  styleUrls: ['./component-one.component.css']
})
export class ComponentOneComponent implements OnInit {
  upperName:string;
  constructor(public cservice : ConversionService) { 

  }
  fun(txt:HTMLInputElement)
  {
    this.upperName=this.cservice.convertupper(txt.value);
  }
  ngOnInit() {
  }

}
