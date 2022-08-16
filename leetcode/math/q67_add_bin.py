class Solution:
    def addBinary(self, a: str, b: str) -> str:
        # :b is the special characters used by python to say that
        # the output is in binary format
        # int(a, base) function: the second para def the integral to use
        return f'{int(a, 2) + int(b, 2):b}'
        # or try: https://leetcode.com/problems/add-binary/discuss/2388585/One-line-Python-solution
        