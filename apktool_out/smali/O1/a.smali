.class public LO1/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LO1/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LO1/a$a;
    }
.end annotation


# static fields
.field static final a:LO1/a;

.field private static final b:LO1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LO1/a;

    .line 2
    .line 3
    invoke-direct {v0}, LO1/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LO1/a;->a:LO1/a;

    .line 7
    .line 8
    new-instance v0, LO1/a$a;

    .line 9
    .line 10
    invoke-direct {v0}, LO1/a$a;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, LO1/a;->b:LO1/c;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a()LO1/c;
    .locals 1

    .line 1
    sget-object v0, LO1/a;->b:LO1/c;

    .line 2
    .line 3
    return-object v0
.end method
