﻿//
// Copyright (c) Vogler Engineering GmbH. All rights reserved.
// Licensed under the MIT License. See LICENSE.md in the project root for license information.
//
namespace SmartDevicesGateway.Model.Tabs
{
    public class TabFilterEntry
    {
        public string Name { get; set; }
        public string Key { get; set; }
        public bool Invertable { get; set; }
        public string FilterType { get; set; }
    }
}