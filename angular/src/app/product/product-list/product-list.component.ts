import { Component, OnInit } from '@angular/core';
import { ProductDataService } from 'src/app/services/data/product-data.service';
import { Product } from 'src/app/models/product.model';
import { Router } from '@angular/router';

@Component({
  selector: 'product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  products : Array<Product>;

  constructor(public productService : ProductDataService,public router:Router) { }
  add(){
    // navigate to product-add component
    this.router.navigate(['/product-add']);
  }

  ngOnInit() {
    this.productService.getAllProducts().subscribe((response:any) => {this.products = response});
  }

}
