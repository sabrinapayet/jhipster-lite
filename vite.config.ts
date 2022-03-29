import { defineConfig } from 'vite';
import vue from '@vitejs/plugin-vue';
import path from 'path';
import { quasar, transformAssetUrls } from '@quasar/vite-plugin';

// https://vitejs.dev/config/
export default defineConfig({
  resolve: {
    alias: {
      '@': path.resolve(__dirname, './src/main/webapp/app'),
    },
  },
  plugins: [
    vue({
      template: {
        compilerOptions: {
          isCustomElement: tag => /^x-/.test(tag),
        },
        transformAssetUrls,
      },
    }),
    quasar({
      sassVariables: 'src/main/webapp/content/css/quasar-variables.sass',
    }),
  ],
  build: {
    outDir: '../../../target/classes/static',
  },
  root: 'src/main/webapp',
  server: {
    port: 9000,
  },
});
