import { Component, OnInit } from '@angular/core';
import { AuthenticationserviceService } from '../services/authenticationservice.service';

@Component({
  selector: 'logout',
  templateUrl: './logout.component.html',
  styleUrls: ['./logout.component.css']
})
export class LogoutComponent implements OnInit {

  constructor(public auth:AuthenticationserviceService) { }
   
  ngOnInit() {
    this.auth.logout();
  }

}
