﻿//
// Copyright (c) Vogler Engineering GmbH. All rights reserved.
// Licensed under the MIT License. See LICENSE.md in the project root for license information.
//
using System.Diagnostics.CodeAnalysis;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;

namespace SmartDevicesGateway.Model.Enums
{
    [JsonConverter(typeof(StringEnumConverter))]
    [SuppressMessage("ReSharper", "InconsistentNaming")]
    public enum DeviceScreenDimension
    {
        LDPI,
        MDPI,
        TVDPI,
        HDPI,
        XHDPI,
        XXHDPI,
        XXXHDPI,
        Unknown
    }
}