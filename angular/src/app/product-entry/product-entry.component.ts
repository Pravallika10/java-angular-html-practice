import { Component, EventEmitter,OnInit, Output } from '@angular/core';
import { Product } from '../models/product.model';
//import { EventEmitter } from 'events';

@Component({
  selector: 'product-entry',
  templateUrl: './product-entry.component.html',
  styleUrls: ['./product-entry.component.css']
})
export class ProductEntryComponent implements OnInit {

  @Output()
  submit_info : EventEmitter<Product>;

  constructor() { 
    // initialize event object
    this.submit_info = new EventEmitter();
  }

  saveProduct(txtName:HTMLInputElement, txtCategory:HTMLInputElement, txtCost:HTMLInputElement):void{
    // create a new Product Object from coming values 
    let product = new Product(txtName.value, txtCategory.value, parseInt(txtCost.value));
   
    // send product object to Product-base component
    // by invocking an event
    this.submit_info.emit(product);// ~ $event

    // reset the form
    txtName.value = "";
    txtCategory.value = "";
    txtCost.value = "";
}

  ngOnInit() {
  }
}

