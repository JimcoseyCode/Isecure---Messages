.class abstract LQ0/f$b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQ0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# static fields
.field static final a:Landroidx/datastore/preferences/protobuf/C;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Landroidx/datastore/preferences/protobuf/k0$b;->q:Landroidx/datastore/preferences/protobuf/k0$b;

    .line 2
    .line 3
    sget-object v1, Landroidx/datastore/preferences/protobuf/k0$b;->s:Landroidx/datastore/preferences/protobuf/k0$b;

    .line 4
    .line 5
    invoke-static {}, LQ0/h;->Z()LQ0/h;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const-string v3, ""

    .line 10
    .line 11
    invoke-static {v0, v3, v1, v2}, Landroidx/datastore/preferences/protobuf/C;->d(Landroidx/datastore/preferences/protobuf/k0$b;Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/k0$b;Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/C;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, LQ0/f$b;->a:Landroidx/datastore/preferences/protobuf/C;

    .line 16
    .line 17
    return-void
.end method
