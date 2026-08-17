.class LO7/a$b;
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
    iput-object p1, p0, LO7/a$b;->g:LO7/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()Lv8/k;
    .locals 2

    .line 1
    new-instance v0, Lv8/g;

    .line 2
    .line 3
    iget-object v1, p0, LO7/a$b;->g:LO7/a;

    .line 4
    .line 5
    invoke-virtual {v1}, LO7/a;->A0()Lv8/k;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Lv8/g;-><init>(Lv8/k;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LO7/a$b;->a()Lv8/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
