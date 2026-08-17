.class LO7/a$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lw7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO7/a;-><init>(LB8/n;Lk8/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic g:LO7/a;


# direct methods
.method constructor <init>(LO7/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LO7/a$a;->g:LO7/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()LC8/d0;
    .locals 3

    .line 1
    iget-object v0, p0, LO7/a$a;->g:LO7/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LO7/a;->A0()Lv8/k;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, LO7/a$a$a;

    .line 8
    .line 9
    invoke-direct {v2, p0}, LO7/a$a$a;-><init>(LO7/a$a;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1, v2}, LC8/J0;->v(LL7/h;Lv8/k;Lkotlin/jvm/functions/Function1;)LC8/d0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LO7/a$a;->a()LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
