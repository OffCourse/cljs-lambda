# CLJS-Lambda

This is a simple skeleton to help you write your AWS lambda functions in clojurescript. As opposed to [nervous-systems](https://nervous.io/) pioneering work (cljs-lambda library)[https://github.com/nervous-systems/cljs-lambda], I prefer a more barebones approach.

This skeleton does not provide any clojure abstractions around lambda, but - using [node-lambda](https://github.com/motdotla/node-lambda) - rather exposes an easily workflow to run and deploy clojurescript functions to AWS. 

## Instructions

Before you start, make sure to run 'npm install'.

'boot build' compiles the clojurescript code, which can be tested by running 'npm start. When you want to run your function on AWS, run 'npm run deploy'. For convencience, I provide a 'npm run deploy-prod' task as well.

All javascript dependencies should be added to the package.json file (or through 'npm install <lib-name> --save').

All clojurescript deps should be added to the build.boot file.

Twitter: @yeehaa   
Github: yeehaa123
