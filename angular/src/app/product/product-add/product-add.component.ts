import { Component, OnInit } from '@angular/core';
import { ProductDataService } from 'src/app/services/data/product-data.service';
import { Product } from 'src/app/models/product.model';

@Component({
  selector: 'product-add',
  templateUrl: './product-add.component.html',
  styleUrls: ['./product-add.component.css']
})
export class ProductAddComponent implements OnInit {

  constructor(public productService: ProductDataService) { }

  ngOnInit() {
  }
  saveProduct(txtName:HTMLInputElement, txtCategory:HTMLInputElement, txtCost:HTMLInputElement):void{
    
    let product = new Product(txtName.value, txtCategory.value, parseInt(txtCost.value));
    this.productService.addNewProduct(product).subscribe((response) => console.log(response));
    txtName.value = "";
    txtCategory.value = "";
    txtCost.value = "";
}


}
