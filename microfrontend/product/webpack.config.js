const HtmlWebpackPlugin = require('html-webpack-plugin');
// const { ModuleFederationPlugin } = require('webpack').container;

const ModuleFederationPlugin = require('webpack/lib/container/ModuleFederationPlugin');

module.exports = {
  mode: 'development',

  devServer: {
    port: 3001,
  },
  plugins: [
    new ModuleFederationPlugin({
      name: 'products',
      filename: 'entryPoint.js',
      exposes: {
        './ProductIndex': './src/product_bootup.js',
      },
      // shared: ['chance'],
    }),
    new HtmlWebpackPlugin({
      template: './public/index.html',
    }),
  ],
};
