.class public final La6/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:Lc6/i;

.field private final b:LH4/I;


# direct methods
.method public constructor <init>(Lc6/i;)V
    .locals 1

    .line 1
    const-string v0, "common"

    .line 2
    .line 3
    invoke-static {v0}, LH4/Q;->b(Ljava/lang/String;)LH4/I;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La6/a;->a:Lc6/i;

    .line 11
    .line 12
    iput-object v0, p0, La6/a;->b:LH4/I;

    .line 13
    .line 14
    return-void
.end method
