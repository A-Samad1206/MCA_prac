const express = require('express');
const mongoose = require('mongoose');

const app = express();

app.get('/', (req, res) => {
  console.log('first');
  res.send('csdfsdf');
  return 'ok cjsdkn cjskdn';
});

app.listen(3000, () => {
  console.log(`Hello on 3000`);
  mongoose
    .connect('mongodb://my_mongo:27017/my_db')
    .then((res) => {
      console.log('Connected');
    })
    .catch((err) => {
      console.log('error');
    });
});
