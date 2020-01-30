import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Product} from 'src/app/models/product.model';
const API_URL = "http://localhost:3000/products"; 

@Injectable({
  providedIn: 'root'
})
export class ProductDataService {

  constructor(public http:HttpClient) { }
  getAllProducts(){
    return this.http.get(API_URL);
  }
  addNewProduct(product : Product){
    return this.http.post(API_URL, product);
  }
}
