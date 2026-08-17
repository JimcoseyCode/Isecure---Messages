.class public final Ly5/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly5/a$a;
    }
.end annotation


# instance fields
.field private a:I

.field private b:Ly5/d$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ly5/d$a;->g:Ly5/d$a;

    .line 5
    .line 6
    iput-object v0, p0, Ly5/a;->b:Ly5/d$a;

    .line 7
    .line 8
    return-void
.end method

.method public static b()Ly5/a;
    .locals 1

    .line 1
    new-instance v0, Ly5/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ly5/a;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public a()Ly5/d;
    .locals 3

    .line 1
    new-instance v0, Ly5/a$a;

    .line 2
    .line 3
    iget v1, p0, Ly5/a;->a:I

    .line 4
    .line 5
    iget-object v2, p0, Ly5/a;->b:Ly5/d$a;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Ly5/a$a;-><init>(ILy5/d$a;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public c(I)Ly5/a;
    .locals 0

    .line 1
    iput p1, p0, Ly5/a;->a:I

    .line 2
    .line 3
    return-object p0
.end method
