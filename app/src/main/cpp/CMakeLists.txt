cmake_minimum_required(VERSION 3.10.2)

project("cockatiel")

add_library(
             i-love-cockatiels

             SHARED

            i-love-cockatiels.cpp )


find_library(
              log-lib

              log )

target_link_libraries(
                        i-love-cockatiels

                       ${log-lib} )