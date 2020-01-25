import { Component, OnInit,Input } from '@angular/core';
import {Media} from '../models/mediacontent';
@Component({
  selector: 'mediadisplay',
  templateUrl: './mediadisplay.component.html',
  styleUrls: ['./mediadisplay.component.css']
})
export class MediadisplayComponent implements OnInit {
   @Input()
   medialist :Array<Media>
  constructor() { }

  ngOnInit() {
  }

}
