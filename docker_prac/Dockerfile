FROM node:18-alpine as Base
WORKDIR /usr/src/app
COPY package*.json ./
RUN npm install
COPY . .

FROM base AS dev
CMD ["npm", "run", "dev"]

FROM base as prod
RUN npm prune --production
CMD ["node", "index"]