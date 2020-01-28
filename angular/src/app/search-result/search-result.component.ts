import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'search-result',
  templateUrl: './search-result.component.html',
  styleUrls: ['./search-result.component.css']
})
export class SearchResultComponent implements OnInit {
   searchdata:string;
  constructor(public activatedRoute : ActivatedRoute) { 
    this.activatedRoute.params.subscribe((parameter) => this.searchdata = parameter["searchText"]);
  }

  ngOnInit() {
  }

}
