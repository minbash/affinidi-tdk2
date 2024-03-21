/* tslint:disable */
/* eslint-disable */
/**
 * VerificationService
 * Affinidi VerificationService Structure
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: nucleus.team@affinidi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import type { Configuration } from './configuration';
// Some imports not used depending on template conditions
// @ts-ignore
import type { AxiosPromise, AxiosInstance, RawAxiosRequestConfig } from 'axios';
import globalAxios, { AxiosError } from 'axios';
import axiosRetry from 'axios-retry';

export class SdkError extends Error {
  private readonly details: undefined;
  private readonly traceId: string;
  private readonly httpStatusCode: number | undefined;

  constructor(originalError: unknown = {}) {
    const isAxiosError = originalError instanceof AxiosError;

    if (!isAxiosError) {
      throw originalError;
    }

    super(originalError.response?.data?.message);

    this.name = originalError.response?.data?.name;
    this.details = originalError.response?.data?.details;
    this.message = originalError.response?.data?.message;
    this.traceId = originalError.response?.data?.traceId;
    this.httpStatusCode = originalError.response?.status;
  }
}

export const BASE_PATH = 'http://localhost'.replace(/\/+$/, '');
const MAX_AXIOS_REQUESTS_RETRY = 3;

/**
 *
 * @export
 */
export const COLLECTION_FORMATS = {
  csv: ',',
  ssv: ' ',
  tsv: '\t',
  pipes: '|',
};

/**
 *
 * @export
 * @interface RequestArgs
 */
export interface RequestArgs {
  url: string;
  options: RawAxiosRequestConfig;
}

/**
 *
 * @export
 * @class BaseAPI
 */
export class BaseAPI {
  protected configuration: Configuration | undefined;

  constructor(
    configuration?: Configuration,
    protected basePath: string = BASE_PATH,
    protected axios: AxiosInstance = globalAxios,
    retryConfig?: any
  ) {
    if (configuration) {
      this.configuration = configuration;
      this.basePath = configuration.basePath ?? basePath;
    }

    axiosRetry(globalAxios, {
      // NOTE: Max retries is 3
      retries:
        retryConfig == undefined ||
        retryConfig?.retries > MAX_AXIOS_REQUESTS_RETRY
          ? MAX_AXIOS_REQUESTS_RETRY
          : retryConfig.retries,
      retryDelay: axiosRetry.exponentialDelay,
      // NOTE: custom can look like
      // (retryCount) => { retryCount * 1000 }
      retryCondition(error) {
        // NOTE: retrying only for 5XX errors
        if (error?.response && error.response.status >= 500) {
          return true;
        }

        // return false
        throw new SdkError(error);
      },
      onRetry: (retryCount, error, requestConfig) => {
        console.log(retryCount);
      },
    });
  }
}

/**
 *
 * @export
 * @class RequiredError
 * @extends {Error}
 */
export class RequiredError extends Error {
  constructor(public field: string, msg?: string) {
    super(msg);
    this.name = 'RequiredError';
  }
}

interface ServerMap {
  [key: string]: {
    url: string;
    description: string;
  }[];
}

/**
 *
 * @export
 */
export const operationServerMap: ServerMap = {};
