import { Injectable } from '@angular/core';
import { UpperCasePipe } from '@angular/common';

@Injectable({
  providedIn: 'root'
})
export class ConversionService {
  constructor() 
  { }
    convertupper(st:string):string
    {
       return st.toUpperCase();
    }
}
