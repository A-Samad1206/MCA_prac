import Chance from 'chance';
const chance = Chance();

const mount = (el, num = 2) => {
  console.log('el from cart mkount ', el);
  let products = '';

  for (let i = 0; i < num; i++) products += `<h1>Cart - ${chance.name()}</h1>`;

  el.innerHTML = products;
};

if (process.env.NODE_ENV === 'development') {
  // mount(document.getElementById('carts-box'));
}

export { mount };
