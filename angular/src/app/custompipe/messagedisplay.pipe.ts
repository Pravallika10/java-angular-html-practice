import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'messagedisplay'
})
export class MessagedisplayPipe implements PipeTransform {
  
 
  transform(value: any): any {
    if(value=="")
        
        return "No data available";
    else
       return value;    
  }


}
