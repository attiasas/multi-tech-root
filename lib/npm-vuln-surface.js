/**
 * Requires vulnerable direct dependencies so SCA tools see them on the first-party graph.
 * For security pipeline / mirror tests only — not for production.
 */
module.exports = {
  oclif: require('@oclif/core'),
  componentEmitter: require('component-emitter'),
  decodeUriComponent: require('decode-uri-component'),
  minimist: require('minimist'),
  lodash: require('lodash'),
  axios: require('axios'),
  merge: require('merge'),
  globParent: require('glob-parent'),
  yargsParser: require('yargs-parser'),
  serializeJavascript: require('serialize-javascript'),
  jsonSchema: require('json-schema'),
};
