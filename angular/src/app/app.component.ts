import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationserviceService } from './services/authenticationservice.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'routingexample';
  constructor(private router : Router, public auth:AuthenticationserviceService){

  }
   searchCall(srch : HTMLInputElement){
    if(srch.value != ""){
      this.router.navigate(['/search/' + srch.value]); //  connect data
    }
  }
}

