import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationserviceService } from '../services/authenticationservice.service';

@Component({
  selector: 'login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
    errorMessage:string;
    authorised:boolean;
  constructor(public auth:AuthenticationserviceService,public router:Router) { 
    this.errorMessage="invalid credentials";
     this.authorised=true;
  }
   checklogin(txtlogin:HTMLInputElement,txtpass:HTMLInputElement)
   {
     if(this.auth.authenticate(txtlogin.value,txtpass.value))
     {
        this.authorised=true;
        this.router.navigate(['/product']); 
     }
     else{
      this.authorised = false;
     }
   }
  ngOnInit() {
  }

}
