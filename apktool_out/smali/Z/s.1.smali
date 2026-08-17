.class public abstract LZ/s;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZ/s$b;,
        LZ/s$a;
    }
.end annotation


# instance fields
.field private final a:LZ/s$b;


# direct methods
.method constructor <init>(LZ/s$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LZ/s;->a:LZ/s$b;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 1
    iget-object v0, p0, LZ/s;->a:LZ/s$b;

    .line 2
    .line 3
    invoke-virtual {v0}, LZ/s$b;->a()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public b()J
    .locals 2

    .line 1
    iget-object v0, p0, LZ/s;->a:LZ/s$b;

    .line 2
    .line 3
    invoke-virtual {v0}, LZ/s$b;->b()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public c()Landroid/location/Location;
    .locals 1

    .line 1
    iget-object v0, p0, LZ/s;->a:LZ/s$b;

    .line 2
    .line 3
    invoke-virtual {v0}, LZ/s$b;->c()Landroid/location/Location;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
