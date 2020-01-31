import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MessagedisplayPipe } from './custompipe/messagedisplay.pipe';
import { MessageComponent } from './custompipe/message/message.component';

@NgModule({
  declarations: [
    AppComponent,
    MessagedisplayPipe,
    MessageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
