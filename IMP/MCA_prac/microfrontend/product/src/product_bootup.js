import Chance from 'chance';
const chance = Chance();

const mount = (el, num = 2) => {
  let products = '';

  for (let i = 0; i < num; i++)
    products += `<h2>Product - ${chance.word()}</h2>`;

  el.innerHTML = products;
};
if (process.env.NODE_ENV == 'development') {
  // mount(document.querySelector('#products-box'));
}

export { mount };
