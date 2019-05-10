// import { bootstrap }    from '@angular/platform-browser-dynamic';
import { enableProdMode } from '@angular/core';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';

import { AppModule } from './app/app.module';
import { environment } from './environments/environment';

// import {RestService} from './app/rest-service';
// import {HTTP_PROVIDERS} from '@angular/http';
// import {ROUTER_PROVIDERS, Router} from '@angular/router';

// 
// bootstrap(App, [HTTP_PROVIDERS, ROUTER_PROVIDERS]);

if (environment.production) {
  enableProdMode();
}

platformBrowserDynamic().bootstrapModule(AppModule)
  .catch(err => console.log(err));
