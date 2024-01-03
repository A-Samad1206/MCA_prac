import { mount } from 'product/ProductIndex';
import { mount as cartMount } from 'cart/CartIndex';
console.log(document);
mount(document.querySelector('#products-box'), 4);
cartMount(document.getElementById('cart-box'), 4);

console.log('From container!');
