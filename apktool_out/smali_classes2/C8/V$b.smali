.class final LC8/V$b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC8/V;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:LC8/d0;

.field private final b:LC8/v0;


# direct methods
.method public constructor <init>(LC8/d0;LC8/v0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LC8/V$b;->a:LC8/d0;

    .line 5
    .line 6
    iput-object p2, p0, LC8/V$b;->b:LC8/v0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()LC8/d0;
    .locals 1

    .line 1
    iget-object v0, p0, LC8/V$b;->a:LC8/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()LC8/v0;
    .locals 1

    .line 1
    iget-object v0, p0, LC8/V$b;->b:LC8/v0;

    .line 2
    .line 3
    return-object v0
.end method
