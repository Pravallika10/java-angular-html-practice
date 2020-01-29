import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, RouterStateSnapshot, Router, CanActivate } from '@angular/router';
import { AuthenticationserviceService } from './authenticationservice.service';

@Injectable({
  providedIn: 'root'
})
export class AuthGaurdService implements CanActivate{

  constructor(public auth : AuthenticationserviceService, public router : Router) { }
  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot) {

    // check from authentication service is user is logged in
    if(this.auth.isuserloggedin())
        return true;
    else{
      // navigate to login component
      this.router.navigate(['/login']);
      return false;
    }    
  }      
}
