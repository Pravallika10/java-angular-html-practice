import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'message',
  templateUrl: './message.component.html',
  styleUrls: ['./message.component.css']
})
export class MessageComponent implements OnInit {
  msg:string;
  constructor() { 
  this.msg="";
  }

  ngOnInit() {
  }

}
