const HtmlWebpackPlugin = require('html-webpack-plugin');
const { ModuleFederationPlugin } = require('webpack').container;
// const ModuleFederationPlugin = require('webpack/lib/container/ModuleFederationPlugin');

module.exports = {
  mode: 'development',

  devServer: {
    port: 3002,
  },
  plugins: [
    new ModuleFederationPlugin({
      name: 'cart',
      filename: 'entry.js',
      exposes: {
        './CartIndex': './src/bootup.js',
      },
      // shared: ['chance'],
    }),
    new HtmlWebpackPlugin({
      template: './public/index.html',
    }),
  ],
};
