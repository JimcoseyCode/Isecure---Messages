.class public final LB1/e$c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LB1/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LB1/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:LB1/e$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LB1/e$c$a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LB1/e$c$a;-><init>(LB1/e$c;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LB1/e$c;->a:LB1/e$a;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public build(LB1/r;)LB1/n;
    .locals 1

    .line 1
    new-instance p1, LB1/e;

    .line 2
    .line 3
    iget-object v0, p0, LB1/e$c;->a:LB1/e$a;

    .line 4
    .line 5
    invoke-direct {p1, v0}, LB1/e;-><init>(LB1/e$a;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public teardown()V
    .locals 0

    .line 1
    return-void
.end method
