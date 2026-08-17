.class LG0/n$e;
.super LG0/n$d;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LG0/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "e"
.end annotation


# instance fields
.field private final b:Z


# direct methods
.method constructor <init>(LG0/n$c;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LG0/n$d;-><init>(LG0/n$c;)V

    .line 2
    .line 3
    .line 4
    iput-boolean p2, p0, LG0/n$e;->b:Z

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method protected a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LG0/n$e;->b:Z

    .line 2
    .line 3
    return v0
.end method
