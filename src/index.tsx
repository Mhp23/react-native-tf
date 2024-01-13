import { NativeModules, Platform } from 'react-native';

const LINKING_ERROR =
  `The package 'react-native-tf' doesn't seem to be linked. Make sure: \n\n` +
  Platform.select({ ios: "- You have run 'pod install'\n", default: '' }) +
  '- You rebuilt the app after installing the package\n' +
  '- You are not using Expo Go\n';

// @ts-expect-error
const isTurboModuleEnabled = global.__turboModuleProxy != null;

const TfModule = isTurboModuleEnabled
  ? require('./NativeTf').default
  : NativeModules.Tf;

export const Tf = TfModule
  ? TfModule
  : new Proxy(
      {},
      {
        get() {
          throw new Error(LINKING_ERROR);
        },
      }
    );
