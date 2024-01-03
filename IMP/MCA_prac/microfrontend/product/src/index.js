import('./product_bootup').then(({ mount }) =>
  mount(document.getElementById('products-box'), 4)
);
