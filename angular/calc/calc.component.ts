import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'calc',
  templateUrl: './calc.component.html',
  styleUrls: ['./calc.component.css']
})
export class CalcComponent
{
  val1:number;
  val2:number;
  res:number;
  add(val1:HTMLInputElement,val2:HTMLInputElement)
  { 
   this.val1=parseInt(val1.value);
   this.val2=parseInt(val2.value);
   this.res=this.val1 + this.val2;
  }
  sub(val1:HTMLInputElement,val2:HTMLInputElement)
  {
    this.val1=parseInt(val1.value);
    this.val2=parseInt(val2.value);
    this.res=this.val1-this.val2;
  }
  mul(val1:HTMLInputElement,val2:HTMLInputElement)
  {
    this.val1=parseInt(val1.value);
    this.val2=parseInt(val2.value);
    this.res=this.val1  * this.val2;
    
  }
  div(val1:HTMLInputElement,val2:HTMLInputElement)
  {
    this.val1=parseInt(val1.value);
    this.val2=parseInt(val2.value);
    this.res=this.val1 / this.val2;
  }

}
